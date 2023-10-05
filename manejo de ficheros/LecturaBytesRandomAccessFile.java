package lectura_bytes_randomaccessfile;

import java.io.File;

public class LecturaBytesRandomAccessFile {

	public static void main(String[] args) {
		// creamos primero un fichero con los datos a leer
		File pruebaFichero = new File("salida.txt");
		try {
			pruebaFichero.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileWriter escritorFichero = new FileWriter(pruebaFichero);
			escritorFichero.write("Este es un fichero de prueba.");
			// Si no cerramos el stream no se escribe en el fichero!
			escritorFichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			/*
			 * RandomAccessFile posee dos constructores, en ambos constructores el segundo
			 * parámetro es el mismo: el modo de acceso. Sin embargo, para el primer
			 * parámetro tenemos la versión del constructor en la que podemos introducir el
			 * objeto File directamente o, como en el caso de la imagen superior, introducir
			 * la ruta del fichero directamente como String.
			 */
			RandomAccessFile file = new RandomAccessFile("salida.txt", "r");
			/*
			 * Con el método seek() básicamente nos posicionamos en el punto que indiquemos
			 * del fichero. Acepta como parámetro un objeto de tipo “long”.
			 */
			long posicionPuntero = 0;
			file.seek(posicionPuntero);
			/*
			 * Si usamos el método getFilePointer(), obtendremos como respuesta un tipo
			 * long. Este número es exactamente la posición del puntero en Bytes
			 */
			long filePointer = file.getFilePointer();
			/*
			 * Con el método read(), podremos leer un byte directamente de nuestro fichero.
			 * Devolverá dicho byte a partir de la posición actual del puntero.
			 */
			int unByte = file.read();
			System.out.println(
					"El byte leído en el puntero " + String.valueOf(posicionPuntero) + " es: " + (char) unByte);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
