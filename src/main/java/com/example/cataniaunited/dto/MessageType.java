package com.example.cataniaunited.dto;

public enum MessageType {

    //Server Messages
    CONNECTION_SUCCESSFUL,
    CLIENT_DISCONNECTED,
    ERROR,
    LOBBY_UPDATED,
    PLAYER_JOINED,
    LOBBY_CREATED,
    GAME_WON,
    GAME_BOARD_JSON,

    START_GAME,
    GAME_STARTED,

    DICE_RESULT,
    PLAYER_RESOURCES,


    //Client Messages
    CREATE_LOBBY,
    JOIN_LOBBY,
    SET_USERNAME,
    SET_ACTIVE_PLAYER, //-> TODO: Remove after implementation of player order
    PLACE_SETTLEMENT,
    UPGRADE_SETTLEMENT,
    PLACE_ROAD,
    CREATE_GAME_BOARD,
    GET_GAME_BOARD,
    ROLL_DICE
}