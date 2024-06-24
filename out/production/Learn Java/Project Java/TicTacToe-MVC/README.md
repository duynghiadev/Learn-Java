# TicTacToe-MVC
This project was created to practice a software architectural pattern Model–View–Controller (MVC)

### It has two game modes: 
1) Player vs Computer
2) Player vs Player 

### There are two different views implemented: 
1) Swing 

![screenshot_1](https://cloud.githubusercontent.com/assets/26466644/24830217/9568b0de-1c81-11e7-9a7e-e99c80333d4c.png)

2) Console

![screenshot_2](https://cloud.githubusercontent.com/assets/26466644/24830221/9f0057d2-1c81-11e7-9a65-c95c9a5acf12.png)

### To check them both:
The only thing you need is to change the view -> comment/uncomment lines:
```java
// view:
VisualInterface view = new TicTacToeSwing();
//VisualInterface view = new TicTacToeConsole();
```
in the `TicTacToeGame` class of package `com.enfocat.tictactoe`

### Computer AI logic:
I tried to use Monte Carlo simulations in decision making in picking the best moves for computer.

### Technologies:
The project was created with
**Eclipse** IDE for Java Developers,
**Version:** Neon.2 Release (4.6.2)
