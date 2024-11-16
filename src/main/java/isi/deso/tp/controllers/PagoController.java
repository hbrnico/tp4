package isi.deso.tp.controllers;

import isi.deso.tp.logicaNegocios.Pago;
import isi.deso.tp.persistencia.PagoDao;
import isi.deso.tp.persistencia.PagoMemory;

public class PagoController {

    public static void crearPago(Pago pago){
        PagoDao pagoDao = new PagoMemory();
        pagoDao.crearPago(pago);
    }



}
