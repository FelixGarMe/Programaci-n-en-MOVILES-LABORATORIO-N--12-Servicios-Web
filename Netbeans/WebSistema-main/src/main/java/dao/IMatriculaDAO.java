
package dao;

import java.util.List;
import modelos.*;

public interface IMatriculaDAO{
    public List<Alumnos> buscarAlumnos(Alumnos alumno);
    public List<Cursos> buscarCursos();
    public boolean grabarMatricula(String[] datosMatricula, String[] codigoCursos, String[] montos);
    public List<Matriculas> listarMatriculas(Matriculas matricula);
}
