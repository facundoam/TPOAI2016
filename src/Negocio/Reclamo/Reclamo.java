package Negocio.Reclamo;

import Negocio.Externos.Cliente;

import java.util.Date;

/**
 * @author farias on 29/08/16.
 */
public class Reclamo {
    private Date fecha;
    private int numeroReclamo;
    private Cliente cliente;
    private String descripcion;
    private String estado;
    private Date fechaUltimaActualizacion;
    private String detalleUltimaActualizacion;
    private Date fechaCierre;
}
