# IntervalMerge

##Aufgabe 

Lösung zu Coding Task 2
Implementieren Sie eine Funktion MERGE die eine Liste von Intervallen entgegennimmt und als
Ergebnis wiederum eine Liste von Intervallen zurückgibt. Im Ergebnis sollen alle sich
überlappenden Intervalle gemerged sein. Alle nicht überlappenden Intervalle bleiben unberührt.

Beispiel: Input: [25,30] [2,19] [14, 23] [4,8]  Output: [2,23] [25,30]



## Überlegungen
###Intervalle
Wann überlappen sich zwei Intervalle i1 und i2.
Dies ist der Fall, wenn fogende Bedingungen erfüllt sind.
```
Bedingung 1: i1.end >= i2.start
Bedingung 2: i1.start <= i2.end
```
###Lösungsideen
- Eine Brute-Force Lösung wäre, jedes Intervall auf Überlappung mit jedem anderen Intervall zu überprüfen. 
Diese Herangehensweise ist allerdings nicht effizient und hätte eine Laufzeit von O(n^2) benötigt.

- Wird die Liste mit Intervallen anhand der Startwerte vorsortiert muss nurnoch Bedinung 1 geprüft werden.
Findet eine Überlappung statt wird das Ende des ersten Intervalls angepasst, findet keine Überlapppung stat wird der Intervall in die Ergebnisliste gespeichert

## Laufzeit
- Collections.sort() benötigt eine Laufzeit von  O(n log(n)).
- Mergen der Intervalle in die Ergebnisliste benötigt eine Laufzeit von O(n).
- Ergibt eine Gesamtlaufzeit von O(n log(n)).

## Speicherverbrauch
Das sortieren der Liste findet in der Liste selbst statt, benötigt also keinen weiteren Speicher.
Nur die Ergebnisliste benötigt im worst case O(n) da die komplette Intervall Liste kopiert wird.

### Wie kann die Robustheit sichergestellt werden, vor allem auch mit Hinblick auf sehr große Eingaben ?
- Sind mit sehr großen Eingaben große Zahlen gemeint, kann bei Überschreitung von Integer.max eine Exception geworfen werden.
- Sind mit sehr großen Eingaben eine große Anzahl an Intervallen gemeint, könnte der Speicher überlaufen. Hier könnte man eine maximale Größe für die Eingabeliste angeben und vor der Ausführung überprüfen.
