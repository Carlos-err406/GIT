import cu.edu.cujae.ceis.tree.TreeNode;
import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import cu.edu.cujae.ceis.tree.general.GeneralTree;
import cu.edu.cujae.ceis.tree.iterators.general.InDepthIterator

public class Empresa {
    private GeneralTree<Dependencia> tree;

    public Empresa(Direccion direccion) {
        this.tree.setRoot(new BinaryTreeNode<Dependencia>(direccion));
    }

    //    Implementar el método que permita unir dos
//    departamentos. Para ello se conoce el nombre
//    de los dos departamentos de origen y el nombre del
//    nuevo departamento, el cual debe quedar en la
//    subdirección (suponiendo que sean distintas) a la que
//    pertenece el jefe seleccionado. Se debe colocar entre
//    los dos jefes al que mayor cantidad de años de
//    experiencia tenga en el cargo (en caso de ser iguales,
//    el del primer departamento que se pasa como parámetro).
//    La cantidad de trabajadores del nuevo departamento
//    será la suma de los dos departamentos de origen.
    public BinaryTreeNode<Dependencia> buscarDepartamento(String dep) {
        InDepthIterator<Dependencia> i = this.tree.inDepthIterator();
        boolean found = false;
        Dependencia res = null
        while (i.hasNext() && !found) {
            Dependencia current = i.next();
            if (dep.nombre == dep) {
                if (dep instanceof Departamento)
                    res = dep
                found = true;
            }
        }
        return res;
    }

    public void unirDep(String dep1, String dep2, String newName) {
        BinaryTreeNode<Dependencia> departamento1 = buscarDependencia(dep1);
        BinaryTreeNode<Dependencia> departamento2 = buscarDependencia(dep2);
        if (departamento1 != null && departamento2 != null) {
            int annos1 = departamento1.getInfo().dirigente.edad;
            int annos2 = departamento2.getInfo().dirigente.edad;
            int newCantMax = ((Departamento) departamento1).maxCantTrabajadores + ((Departamento) departamento2).maxCantTrabajadores;
            if (annos1 >= annos2) {
                ((Departamento) departamento1).maxCantTrabajadores = newCantMax;//setear la nueva cantidad maxima de trabajadores
                ((Departamento) departamento1).trabajadores.addAll(((Departamento) departamento2).trabajadores);//agregar todos los trabajadores de dep2 a dep1
                ((Departamento) departamento1).trabajadores.add(((Departamento)departamento2).dirigente);//agregar el dirigente de dep2 como trabajador de dep1
                ((Departamento) departamento1).nombre = newName;//setear el nuevo nombre del departamento
                departamento2 = null;//eliminar el departamento absorbido
            } else (annos2 > annos1) {
                ((Departamento) departamento2).maxCantTrabajadores = newCantMax;
                ((Departamento) departamento2).trabajadores.addAll(((Departamento) departamento1).trabajadores);
                ((Departamento) departamento2).trabajadores.add(((Departamento)departamento1).dirigente);
                ((Departamento) departamento2).nombre = newName;
                departamento1 = null;
            }
        }
    }
}
