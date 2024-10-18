package isi.deso.tp4.observer;

import isi.deso.tp4.logicaNegocios.ESTADO;

public interface Observable{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void setEstado(ESTADO estadoCambio);
}