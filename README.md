<h1> ♨️ Java SNAP Game</h1>
This was a _nology project where I built a snap game basede on the card game in Java which can be played in the command line with 2 players.

<h2>✍️ Functionality:</h2>
<ul>😵 Each player presses [ENTER] until a matching card occurs which = [SNAP] </ul>
<ul>😵 When [SNAP] occurs, you have 2 seconds to type in snap to win, if you don't the game will carry on until somebody wins or the cards run out </ul>

<h2>🧩 Components</h2>
<br>The project is structured with the following Classes:
<br><br>
<uL><b>Main:</b>The root component that initializes the game</uL>
<uL><b>Card:</b> The container for the card</uL>
<uL><b>CardGame:</b> The container for the card methods i.e. shuffle, deal card</uL>
<uL><b>Snap:</b> The container for the game logic and displaying the results of the card dealt and winnings </uL>
<uL><b>Player:</b> The container for the playernames </uL>

<h2>Code Snippet</h2>

```
    if ((previousCard !=null ) && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("> * type [SNAP] in 2 seconds to win! * <");
```

The above code is what I used to check for a SNAP so if the previous card is not null (which it is defaulted to at the start of the game) and the symbol of the current card (newest card dealt) is equal to the previous card dealt, then this is a match and the timer and logic will follow.
<br>

<h2>Project Previews</h2>

<b>Start of Game ></b>
<br><img width="408" alt="Screenshot 2024-02-09 at 21 22 39" src="https://github.com/Chelsealily/java-snap-game/assets/148104000/d96d2627-2ef8-45e5-b51a-a41ecf81cf2b">
<br>
<b>Mid Game ></b>

<br>
<img width="395" alt="Screenshot 2024-02-09 at 21 23 08" src="https://github.com/Chelsealily/java-snap-game/assets/148104000/ff6a860b-8a4a-44e9-88b9-8e09e1c68cdb">
<br>
<b>End of Game ></b>
<br>
<img width="325" alt="Screenshot 2024-02-09 at 21 23 38" src="https://github.com/Chelsealily/java-snap-game/assets/148104000/3802c741-d620-406b-8492-0aaaec841b19">



