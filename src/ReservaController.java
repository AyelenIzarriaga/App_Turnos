import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public Reserva crearReserva(@RequestBody CrearReservaRequest request) {

        return reservaService.crearReserva(
                request.getIdCliente(),
                request.getIdProfesional(),
                request.getFecha(),
                request.getHora()
        );
    }
}
