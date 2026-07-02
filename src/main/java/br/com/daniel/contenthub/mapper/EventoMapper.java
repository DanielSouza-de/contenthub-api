package br.com.daniel.contenthub.mapper;

import br.com.daniel.contenthub.dto.EventoDTO;
import br.com.daniel.contenthub.model.Evento;

import java.util.List;
import java.util.stream.Collectors;

public class EventoMapper {

    public static EventoDTO toDTO(Evento evento) {

        if (evento == null) {
            return null;
        }

        return new EventoDTO(
                evento.getId(),
                evento.getTitulo(),
                evento.getDescricao(),
                evento.getData()
        );
    }
    
    public static List<EventoDTO> toDTOList(List<Evento> eventos) {

        return eventos.stream()
                .map(EventoMapper::toDTO)
                .collect(Collectors.toList());

    }

}