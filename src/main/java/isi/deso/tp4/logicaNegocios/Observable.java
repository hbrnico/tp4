package isi.deso.tp4.logicaNegocios;

import java.util.Observer;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void setChanged();
}