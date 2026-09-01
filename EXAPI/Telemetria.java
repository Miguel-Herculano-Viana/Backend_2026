package EXAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Telemetria {
    private String evento;
    private String status;
    private LocalDateTime timestamp;

    public void telemetria(String evento, String status, LocalDateTime timestamp){
        setEvento(evento);
        setStatus(status);
        this.timestamp = LocalDateTime.now();
    }

    public String getEvento(){
        return evento;
    }

    public void setEvento(String evento){
        this.evento = evento;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public LocalDateTime getTimestamp(){
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }


    public Telemetria(String evento, String status){
        setEvento(evento);
        setStatus(status);
        this.timestamp = LocalDateTime.now();
    }
    public void exibirTelemetria(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("\n ---- Dados de telemetria");
        System.out.println("Evento: " + evento);
        System.out.println("Status: " + status);
        System.out.println("Timestamp: " + timestamp.format(formatador));
    }
}
