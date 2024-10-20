package isi.deso.tp.observer;

import isi.deso.tp.logicaNegocios.ESTADO;

public interface Observable{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void setEstado(ESTADO estadoCambio);
}