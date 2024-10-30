import java.io.File;

public class RenombrarDirectorios {

    public void renombrarDirectorios(String path) {
        //validemos que el path sea un directorio
        File directorio = new File(path);
         if (!directorio.exists() || !directorio.isDirectory()){
            System.out.println("la ruta path no es un directorio valido ");
            return;
         }
         //aca vamos a cambiar los nombres 
         //System.out.println("la ruta path es valida");
         renombrarDirectoriosInternos(directorio);
        }
         public void renombrarDirectoriosInternos(File directorio){
                //listar todos los archivos y/o carpetas hijas
            File[] directoriosArchivosInternos = directorio.listFiles();
            if (directoriosArchivosInternos==null){
                return;
         }
         for (File directorioArchivo : directoriosArchivosInternos );
         
            if(directorioArchivos.isDirectory()){
                //si es carpeta cambio el nombre:
                String nombreOriginal = directorioArchivos;

            }
    }

}
