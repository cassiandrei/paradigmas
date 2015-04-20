% dias
segunda(pedro, santa).
segunda(caren, porto).
segunda(henrique, ap).
segunda(bia, ap).
segunda(adriano, ap).
segunda(alice, ap).
segunda(bernado, santa).
segunda(maria, ap).

terca(caren, porto).
terca(pedro, santa).
terca(henrique, porto).
terca(bia, porto).
terca(adriano, ap).
terca(alice, porto).
terca(bernado, santa).
terca(maria, santa).

quarta(pedro, porto).
quarta(caren, porto).
quarta(henrique, ap).
quarta(bia, porto).
quarta(adriano, santa).
quarta(alice, porto).
quarta(bernado, porto).
quarta(maria, santa).

quinta(pedro, santa).
quinta(caren, santa).
quinta(henrique, ap).
quinta(bia, santa).
quinta(adriano, ap).
quinta(alice, ap).
quinta(bernado, santa).
quinta(maria, santa).

sexta(caren, ap).
sexta(pedro, ap).
sexta(henrique, ap).

sexta(bia, ap).
sexta(adriano, ap).
sexta(alice, ap).
sexta(bernado, ap).
sexta(maria, ap).

% dinheiro
pobre(bernado).
pobre(bia).
pobre(pedro).
pobre(maria).
rico(henrique).
rico(adriano).
rico(alice).
rico(caren).

% insano
insano(adriano).
insano(maria).

% casais
casal(bernado, anita).
casal(bernado, caren).
casal(pedro, anita).
casal(pedro, alice).
casal(henrique, alice).
casal(henrique, maria).
casal(adriano, maria).
casal(maria, caren).

% dinheiro
dinheiro(X) :- pobre(X).

% pistas
rouboarma(X) :-  quinta(X, porto); quarta(X, santa); quinta(X, ap); quarta(X, ap).
roubochave(X) :- segunda(X, santa); terca(X, porto).
estavanoap(X) :- quinta(X, ap); sexta(X, ap).

% acesso ao ap
acesso(X) :- rouboarma(X), roubochave(X), estavanoap(X).

% ciumes
ciumes(X,Y) :- casal(X, Y), casal(Y, _); casal(Y, X), casal(X, _); casal(A, X), casal(Y, A); casal(A, X), casal(A, Y).

% motivo
motivo(X) :- dinheiro(X); insano(X); ciumes(X, anita).

% assassino
assassino(X) :- motivo(X), acesso(X).