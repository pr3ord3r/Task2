# IntervalMerge

Lösung zu Coding Task 2
Implementieren Sie eine Funktion MERGE die eine Liste von Intervallen entgegennimmt und als
Ergebnis wiederum eine Liste von Intervallen zurückgibt. Im Ergebnis sollen alle sich
überlappenden Intervalle gemerged sein. Alle nicht überlappenden Intervalle bleiben unberührt.




## Lösungsidee

Die Eingegebenen Intervalle werden nach größe ihres start-Wertes sortiert.
Überschneiden sich Intervalle dann ist der end-Wert des vorherigen Intervalls größer wie der start-Wert des nächsten Intervalls. 


## Laufzeit
Benötigt durch benutzung von Collections.sort() eine Laufzeit von O(n log n).

## Speicherverbrauch
Ist O(n) da im worst case die komplette Intervall Liste kopiert wird.
