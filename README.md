# PCAD 23/24 - Laboratorio 5

# Esercizio

In questo esercizio, vi chiediamo di usare la classe Semaphore di JAVA che propone una implementazione dei semafori. Potete guardare online la documentazione di questa classe e in particolari le tre funzione seguente che rappresentano l’uso dei semafori visto a lezione:

- il costruttore Semaphore (int permits) per creare un nuovo semaforo inizializzato a permits;
- la funzione void acquire() che corrisponde al wait visto a lezione;
- la funzione void release() che corrisponde al signal visto a lezione.

Consideriamo una piscina pubblica con _NS_ spogliatoi individuali e _NC_ armadietti per lasciare i suoi vestiti. Un cliente che si presenta alla piscina realizza le tappe seguente:
- (a) Prende la chiave di uno spogliatoio;
- (b) Prende la chiave di un armadietto;
- (c) Si cambia nello spogliatoio;
- (d) Libera lo spogliatoio;
- (e) Mette i suoi vestiti nel armadietto;
- (f) Rida la chiave dello spogliatoio;
- (g) Nuota (tenendosi la chiave del armadietto);
- (h) Prende la chiave di un spogliatoio;
- (i) Ricupera i suoi vestiti nel armadietto;
- (j) Si riveste nello spogliatoio;
- (k) Libera lo spogliatoio;
- (l) Rida le chiave dello spogliatoio e del armadietto.

Lo scopo del esercizio è di proporre un implementazione in JAVA di un programma che simula il comportamento dei clienti in questa piscina.
1. Creare un programma JAVA che simula tanti clienti concorrenti. La disponibilità degli spogliatoi e degli armadietti sarà rappresentata da due semafori che saranno condivisi fra gli diversi thread che rappresentarono i clienti.
2. Testare il vostro programma con diversi numeri di clienti, di spogliatoi e di armadietti. In particolare, provate a trovare casi in cui c’è un deadlock (i.e. tutti i clienti sono bloccati).
3. Proponete un cambio minore nel comportamento dei clienti per evitare questo deadlock.
