# System Design of a TicTacToe Application
This repository contains a simple yet fun implementation of the classic game of Tic Tac Toe. 
The game is designed to be easy to understand and play, making it a great way to learn about system design and game development.

## Design a Tic Tac Toe Application

### Requirements :

- Size of the grid should be N x N
- No of players per Game -> N - 1
- Players can select their symbol / icon, which has to be unique
- Players can play against players or Bots
- Bots can have Difficulty Levels (Easy / Medium / Hard)
- Choose a random player who gets to start the game.
- Deciding Winner is extensible / flexible.
- There can be several winning strategies like :
  - Column Winner
  - Row Winner
  - Diagonal Winner
  - Corner Winner
- Game will draw when no Player can win and has no spaces left.
- Game should continue until one of the Player wins or till the game draws.
- Implement an Undo functionality to revert the last actions

## Class Diagram :

![Class Diagram - Tic Tac Toe](https://github.com/SayantanD99/System-Design-TicTacToe/assets/32683338/6c1a8a61-0382-42b9-b9f1-aa37635b490a)

