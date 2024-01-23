package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TrelloMapperTest {

    @Autowired
    TrelloMapper mapper = new TrelloMapper();
    @Test
    void testMapToBoards() {
        //Given
        List<TrelloBoardDto> boardDtos = Arrays.asList(new TrelloBoardDto("1", "Board1", Arrays.asList(new TrelloListDto("1", "test", false))));
        //When
        List<TrelloBoard> board = mapper.mapToBoards(boardDtos);
        //Then
        assertEquals("1", board.get(0).getId());
    }

    @Test
    void testMapToBoardsDto() {
        //Given
        List<TrelloBoard> board = Arrays.asList(new TrelloBoard("1","Board1",Arrays.asList(new TrelloList("1", "test", false))));
        //When
        List<TrelloBoardDto> boardDto = mapper.mapToBoardsDto(board);
        //Then
        assertEquals("1", boardDto.get(0).getId());
    }

    @Test
    void testMapToList() {
        //Given
        List<TrelloListDto> listDto = Arrays.asList(new TrelloListDto("1", "test", false));
        //When
        List<TrelloList> list = mapper.mapToList(listDto);
        //Then
        assertEquals("1",list.get(0).getId());
    }

    @Test
    void testMapToListDto() {
        //Given
        List<TrelloList> list = Arrays.asList(new TrelloList("1", "test", false));
        //When
        List<TrelloListDto> listDto = mapper.mapToListDto(list);
        //Then
        assertEquals("1",listDto.get(0).getId());
    }

    @Test
    void testMapToCard() {
        //Given
        TrelloCardDto cardDto = new TrelloCardDto("test","test","top","1");
        //When
        TrelloCard card = mapper.mapToCard(cardDto);
        //Then
        assertEquals("test", card.getName());
    }

    @Test
    void testMapToCardDto() {
        //Given
        TrelloCard card = new TrelloCard("test","test","top","2");
        //When
        TrelloCardDto cardDto = mapper.mapToCardDto(card);
        //Then
        assertEquals("test",cardDto.getName());
    }
}