# acceso-a-datos-dam-2
 A este repositorio subiré código de mis prácticas en el módulo "acceso a datos" del segundo curso de DAM.

Puntualizar que solamente están los archivos .java que contienen la clase main de cada proyecto. Para poder ejecutar cada archivo .java deberéis crear un proyecto con vuestro entorno de desarrollo preferido (yo estoy usando Eclipse para este curso), y luego agregar una clase java al proyecto. Después tendréis que copiar el contenido de el archivo .java de este repositorio que queráis ejecutar. Tened en cuenta a la hora de agregar el archivo que éste está en mi proyecto en el package que aparece en la primera línea de código, entonces tendréis que crear dicho paquete con el mismo nombre que aparece en el archivo. Esto suele pedirse en los IDE a la hora de crear-agregar la clase java. Por supuesto, el archivo .java creado en vuestro proyecto deberá tener el mismo nombre que tiene la clase. Ejemplo:

```
public class AccesoADatosMoverFichero {

	public static void main(String[] args) {
		...
```
En este caso el archivo .java que contendrá la clase java que estáis agregando se deberá de llamar:
AccesoADatosMoverFichero.java, de la misma manera que aparece en mi repositorio...

Cualquier duda no dudéis en preguntarme o consultar páginas como por ejemplo stackoverflow.com.

 Dentro del tema "**manejo de ficheros**":

**LecturaStreamCaracteresFileReader.java**: leeremos desde un archivo, creando un flujo de caracteres desde un archivo de nuestro dispositivo y sacaremos por pantalla el flujo carácter a carácter mediante un bucle while.

**EscrituraStreamCaracteresFileWriter.java**: desde código crearemos y escribiremos en un archivo .txt  con la ayuda de la clase FileWriter, mediante un flujo de caracteres.

**CreacionFicheroBytesFileOutputStream.java**: Crearemos un fichero y le agregaremos un array de bytes como datos mediante FileOutputStream.write(arraybites).

**CreacionEliminacionDeFicheros.java**: Crearemos un fichero con File.createNewFile(), y luego lo eliminaremos con File.delete().

**AccesoADatosMoverFichero.java**: Crearemos dos ficheros y moveremos uno a la posición del otro, sustituyéndolo, mediante File.renameTo(File dest).

**LecturaStreamBytesFileInputStream.java**: Leeremos de un fichero .txt creado por nosotros en el código, mediante un stream de bytes, con la clase FileInputStream y su método read(), y lo sacaremos por pantalla.

**LecturaBytesRandomAccessFile.java**: Leeremos de un fichero .txt un byte correspondiente a la posición 0 del puntero (es decir, el primer carácter (char), utilizando la clase RandomAccessFile en modo lectura ("r").

**EscrituraBytesRandomAccessFile.java**: Escribiremos en un fichero .txt un byte en la posición indicada al puntero. Utilizamos el método RandomAccessFile.seek(long puntero) para indicar el lugar donde escribiremos el byte.

... Que disfrutéis de la programación con prudencia y paciencia.
