package GestionESports;

import java.util.HashMap;

        public class Main {
            public static void main(String[] args) {

                // Crear servicio con mapas vacíos
                ServicioESports servicio = new ServicioESports(new HashMap<>(), new HashMap<>(), new HashMap<>());

                // Crear jugadores (4 por equipo)
                Jugador j1 = new Jugador("zeek", "lucas", 22, "Support");
                Jugador j2 = new Jugador("pio", "jose", 25, "Toplaner");
                Jugador j3 = new Jugador("jay", "carlos", 20, "Midlaner");
                Jugador j4 = new Jugador("mixwell", "maria", 23, "ADCarry");

                Jugador j5 = new Jugador("boaster", "pedro", 24, "Toplaner");
                Jugador j6 = new Jugador("chronicle", "manuel", 21, "Support");
                Jugador j7 = new Jugador("tenz", "javier", 26, "Jungla");
                Jugador j8 = new Jugador("nova", "sofia", 22, "Midlaner");

                // Crear equipos
                Equipo equipo1 = new Equipo(new HashMap<>(), new java.util.HashSet<>(), "g2");
                Equipo equipo2 = new Equipo(new HashMap<>(), new java.util.HashSet<>(), "heretics");

                // Registrar equipos en servicio
                servicio.registrarEquipos(equipo1.getNombreEquipo(), equipo1);
                servicio.registrarEquipos(equipo2.getNombreEquipo(), equipo2);

                // Crear torneos
                Torneo torneo1 = new Torneo("Champions");
                Torneo torneo2 = new Torneo("VCT");

                // Registrar torneos en servicio
                servicio.registrarTorneos(torneo1.getNombreTorneo(), torneo1);
                servicio.registrarTorneos(torneo2.getNombreTorneo(), torneo2);

                // Asignar jugadores a equipos
                servicio.asignarJugadorAEquipo(j1, equipo1.getNombreEquipo());
                servicio.asignarJugadorAEquipo(j2, equipo1.getNombreEquipo());
                servicio.asignarJugadorAEquipo(j3, equipo1.getNombreEquipo());
                servicio.asignarJugadorAEquipo(j4, equipo1.getNombreEquipo());

                servicio.asignarJugadorAEquipo(j5, equipo2.getNombreEquipo());
                servicio.asignarJugadorAEquipo(j6, equipo2.getNombreEquipo());
                servicio.asignarJugadorAEquipo(j7, equipo2.getNombreEquipo());
                servicio.asignarJugadorAEquipo(j8, equipo2.getNombreEquipo());

                // Intentar añadir un jugador que ya está en otro equipo
                System.out.println("Intentando añadir jugador duplicado:");
                servicio.asignarJugadorAEquipo(j1, equipo2.getNombreEquipo()); // Debe rechazar

                // Listar jugadores y roles de un equipo
                System.out.println("\njugadores y roles del equipo " + equipo1.getNombreEquipo() + ":");
                for (Jugador j : equipo1.getJugadores()) {
                    System.out.println("jugador: " + j.getNickname() + ", rol: " + j.getRol());
                }

                //Registrar equipos en torneos
                torneo1.aniadirEquipo(equipo1);
                torneo1.aniadirEquipo(equipo2);
                torneo2.aniadirEquipo(equipo1);


                // Intentar registrar equipo duplicado en torneo
                System.out.println("\nintentando registrar equipo duplicado en torneo:");
                torneo1.aniadirEquipo(equipo1); // Debe evitarse

                // Mostrar equipos participantes en torneo1
                System.out.println("\nEquipos en torneo " + torneo1.getNombreTorneo() + ":");
                for (Equipo e : torneo1.getEquiposParticipantes()) {
                    System.out.println(e.getNombreEquipo());
                }

                // 6. Actualizar puntos de equipos en torneos
                torneo1.actualizarPuntosEquipo(equipo1, 15);
                torneo1.actualizarPuntosEquipo(equipo2, 10);
                torneo2.actualizarPuntosEquipo(equipo1, 20);

                // Mostrar clasificación ordenada por puntos en torneo1
                System.out.println("\nClasificación torneo " + torneo1.getNombreTorneo() + ":");
                torneo1.mostrarRankingEquiposPorPuntos();

                // Mostrar equipo ganador en torneo1
                System.out.println("\n El equipo ganador del " + torneo1.getNombreTorneo() + " es: " + torneo1.equipoGanador().getNombreEquipo());

                // Asignar estadísticas individuales a jugadores en torneo1
                EstadisticaJugador estJ1 = new EstadisticaJugador(5, 20, 10, 8);
                j1.agregarEstadistica(torneo1, estJ1);

                EstadisticaJugador estJ5 = new EstadisticaJugador(3, 15, 7, 8);
                j5.agregarEstadistica(torneo1, estJ5);

                // Asignar estadísticas a equipos en torneo1
                EstadisticaEquipo estE1 = new EstadisticaEquipo(5, 3, 15);
                equipo1.agregarEstadistica(torneo1, estE1);

                EstadisticaEquipo estE2 = new EstadisticaEquipo(3, 5, 10);
                equipo2.agregarEstadistica(torneo1, estE2);

                // Consultar KDA de jugador en torneo1
                System.out.println("\nKDA de " + j1.getNickname() + " en " + torneo1.getNombreTorneo() + ": " +
                        estJ1.calcularKDA());

                // Consultar porcentaje de victorias
                System.out.print("\nPorcentaje de victorias del equipo " + equipo1.getNombreEquipo() + ": " +
                        equipo1.getEstadistica(torneo1).calcularPorcentajeVictoria());


                // Intercambiar dos jugadores
                System.out.println("\nIntercambiando jugadores " + j2.getNickname() + " y " + j5.getNickname());
                servicio.intercambiarJugadores(equipo1, j2, equipo2, j5);

                System.out.println("Jugadores en " + equipo1.getNombreEquipo() + " tras intercambio:");
                for (Jugador j : equipo1.getJugadores()) {
                    System.out.println(j.getNickname());
                }
                System.out.println("Jugadores en " + equipo2.getNombreEquipo() + " tras intercambio:");
                for (Jugador j : equipo2.getJugadores()) {
                    System.out.println(j.getNickname());
                }

                // Fusionar equipos
                System.out.println("\nfusionando equipo, en g4");
                Equipo EquipoNuevo = servicio.fusionarEquipos("g2", "heretics", "g4");


                // Mostrar jugadores en el nuevo equipo
                System.out.println("jugadores del equipo g4");
                for (Jugador j : EquipoNuevo.getJugadores()) {
                    System.out.println(j.getNickname());
                }

                // Calcular y mostrar edad media del equipo g4
                double edadMedia = servicio.calcularEdadMedia("g4");
                System.out.println("\nEdad media de jugadores de g4: " + edadMedia);

                // Consultar torneos en los que ha jugado un jugador
                System.out.println("\nTorneos en los que ha jugado " + j5.getNickname() + ":");
                for (String tNombre : servicio.consultarTorneosDeJugador(j1)) {
                    System.out.println(tNombre);
                }

                // Filtrar jugadores por rol en torneo1
                System.out.println("\nJugadores con rol 'Support' en torneo " + torneo1.getNombreTorneo() + ":");
                for (Jugador j : servicio.filtrarJugadoresPorRolEnTorneo(torneo1.getNombreTorneo(), "Support")) {
                    System.out.println(j.getNickname());
                }
            }
        }
