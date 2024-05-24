In alcune esecuzioni con per esempio il caso: 

- 1 spogliatoio
- 2 armadietti 
- 3 clienti
 
ho deadlock.

```
OUTPUT D’ESEMPIO:
 
Cliente 0 ha preso la chiave dello SPOGLIATOIO 0
Cliente 0 ha preso la chiave dell'ARMADIETTO 0
Cliente 0 ha finito di cambiarsi
Il cliente 0 ha lasciato la chiave dello SPOGLIATOIO 0
Cliente 2 ha preso la chiave dello SPOGLIATOIO 0
Cliente 2 ha preso la chiave dell'ARMADIETTO 2
Il cliente0 nuota
Cliente 0 ha preso la chiave dello SPOGLIATOIO 0
Cliente 2 ha finito di cambiarsi
Il cliente 2 ha lasciato la chiave dello SPOGLIATOIO 0
Cliente 1 ha preso la chiave dello SPOGLIATOIO 0
Cliente 0 ha finito di rivestirsi
Il cliente2 nuota
```
