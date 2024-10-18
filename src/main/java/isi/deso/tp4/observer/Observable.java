package isi.deso.tp4.observer;

import java.util.ArrayList;
import java.util.List;

abstract class Observable {

    private List<Observer> suscriptores = new ArrayList<Observer>();

    public void addObserver(Observer o){
        this.suscriptores.add(o);
    }

    public void removeObserver(Observer o) {
        this.suscriptores.remove(o);
    }

    public void notifyObservers() {
        for (int i = 0; i < this.suscriptores.size(); i++){
            this.suscriptores.get(i).update(this);
        }
    }

    //este que hace?
    public void setChanged(){
        
    };
}