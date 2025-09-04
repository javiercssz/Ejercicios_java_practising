import java.io.*;
import java.util.Scanner;

public class conversorYoutubeToMp4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el enlace de YouTube para convertir a MP4:");
            System.out.print("[+] Pega el enlace de YouTube: ");
            String url = scanner.nextLine();

            System.out.println("Descargando y convirtiendo a MP4...");
            String output = "downloaded_video.mp4";
            ProcessBuilder pb = new ProcessBuilder(
                    "C:\\Users\\vipri\\convertidor\\yt-dlp.exe",  // Asegúrate de que la ruta es correcta
                    "-f", "bv+ba/b",  // Esto selecciona el mejor video y audio automáticamente
                    "--merge-output-format", "mp4",  // Combina video y audio en un solo archivo MP4
                    "--ffmpeg-location", "C:\\Users\\vipri\\ffmpeg-7.1-essentials_build\\bin\\ffmpeg.exe",  // Indica la ubicación de ffmpeg
                    "-o", "C:\\Users\\vipri\\Videos\\videosYoutube\\%(title)s.%(ext)s",
                    url
            );
            pb.redirectErrorStream(true);
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
            System.out.println("¡Conversión a MP4 completada!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

