package AnexoV.crudmvc;

import AnexoV.Controlador.CtrlProducto;
import AnexoV.Modelo.ConsultasProducto;
import AnexoV.Modelo.Producto;
import AnexoV.Vista.frmProducto;

/**
 *
 * @author MRoblesDev
 */
public class CRUDMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmProducto frm = new frmProducto();

        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
