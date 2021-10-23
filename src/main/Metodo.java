package main;

//Creamos la clase metodo y agregamos sus funcionalidades
import javax.swing.JOptionPane;

public class Metodo {

    //Creamos los vectores de las preguntas
    private Pregunta nivelUno[];
    private Pregunta nivelDos[];
    private Pregunta nivelTres[];
    private Pregunta nivelCuatro[];
    private Pregunta nivelFinal[];
    private Pregunta auxVector[];

    //Metodo const
    public Metodo() {

        //inicializamos los vectores
        nivelUno = new Pregunta[5];
        nivelDos = new Pregunta[5];
        nivelTres = new Pregunta[5];
        nivelCuatro = new Pregunta[5];
        nivelFinal = new Pregunta[5];
        auxVector = new Pregunta[5];

    }

    //Metodo para insertar preguntas
    public void ConfiguracionJuego() {
        for (int i = 0; i < auxVector.length; i++) {
            int nivelpregunta = Integer.parseInt(JOptionPane.showInputDialog("Digite el nivel de las preguntas."));
            auxVector[i] = new Pregunta(
                    JOptionPane.showInputDialog("Ingresa la Categoria: "),
                    JOptionPane.showInputDialog("Digita la pregunta nº" + i),
                    JOptionPane.showInputDialog("Digita la respuesta CORRECTA."),
                    JOptionPane.showInputDialog("Digita una respuesta incorrecta."),
                    JOptionPane.showInputDialog("Digita una respuesta incorrecta."),
                    JOptionPane.showInputDialog("Digita una respuesta incorrecta."),
            );
            IngresarPreguntasANivel(nivelpregunta);
        }

    }

    //Este metodo es para pasar los datos del vector aux al vector que posea el nivel en las preguntas 
    public void IngresarPreguntasANivel(int opc) {

        switch (opc) {
            case 1:
                for (int i = 0; i < nivelUno.length; i++) {
                    nivelUno[i] = auxVector[i];
                }
                break;
            case 2:
                for (int i = 0; i < nivelDos.length; i++) {
                    nivelDos[i] = auxVector[i];
                }
                break;
            case 3:
                for (int i = 0; i < nivelTres.length; i++) {
                    nivelTres[i] = auxVector[i];
                }
                break;
            case 4:
                for (int i = 0; i < nivelCuatro.length; i++) {
                    nivelCuatro[i] = auxVector[i];
                }
                break;
            case 5:
                for (int i = 0; i < nivelFinal.length; i++) {
                    nivelFinal[i] = auxVector[i];
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error!, el nivel maximo es 5.Máximo");

        }

    }

}
