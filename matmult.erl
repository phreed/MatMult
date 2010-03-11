-module(matmult).
-export([data/1, choice/2, choose/2, sum_set/1, prod_set/2]).
-compile(export_all).

choice(N,1) -> N;
choice(N,K) -> N / K * choice(N-1,K-1).

choose(N,1) -> choice(N,1);
choose(N,K) -> choice(N,K) + choose(N,K-1).

data(a) -> [a11,a12,a21,a22];
data(b) -> [b11,b12,b21,b22];
data(c) -> [c11,c12,c21,c22];
data(cx) -> [{'+',[
               {'*',[a11,b11]},
               {'*',[a12,b21]}]},
             {'+',[
               {'*',[a11,b12]},
               {'*',[a12,b22]}]},
             {'+',[
               {'*',[a21,b11]},
               {'*',[a22,b21]}]},
             {'+',[
               {'*',[a21,b12]},
               {'*',[a22,b22]}]}].

%% sum each pair of terms in a vector
%% A = matmult:data(a).
%% As = matmult:sum_set(A). 
sum_set([]) -> [];
sum_set([H|T]) -> sub_sum(sum_set(T),H,T).

sub_sum(L,M,[]) -> [{'+',[M]}|L];
sub_sum(L,M,[H|T]) -> [{'+',[M,H]}|sub_sum(L,M,T)].
	
%% take the product of two vectors
%% P = matmult:prod_set(As,Bs).
prod_set(As,Bs) -> [{'*',[A,B]} || A<-As, B<-Bs]
                        ++ [{'*',[A]} || A<-As]
			++ [{'*',[B]} || B<-Bs].
	
%% distributive property over
distribute([]) -> []; 
distribute([{'*',M}|T]) -> 
   [case M of
        [{'+',LH},{'+',RH}] ->
        	[{'+',
			[{'*',[L,R]} || L<-LH, R<-RH] ++
			[{'*',[L]} || L<-LH]  ++
			[{'*',[R]} || R<-RH]
	        }];
        [{'+',SH}] ->  
         	[{'+',[{'*',[S]} || S<-SH]}];
        [_] -> []
   end | distribute(T)].

