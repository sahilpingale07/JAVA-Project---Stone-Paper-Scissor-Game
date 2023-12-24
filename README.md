# JAVA-Project---Stone-Paper-Scissor-Game

Project Overview:
Title: Stone-Paper-Scissors Game

Objective: To create a console-based implementation of the Stone-Paper-Scissors game where a user can play against the computer.

Features:
User vs. Computer Gameplay: The game allows a user to play against the computer.
Random Computer Choice: The computer randomly selects one of the three options (stone, paper, or scissors) for each round.
User Input: The user inputs their choice (stone, paper, or scissors) through the console.
Result Display: After each round, the game displays the user's choice, the computer's choice, and the result of the round (win, lose, or draw).
Score Tracking: The game keeps track of the user's and computer's scores, updating them based on the round results.

Implementation Overview:
1. Game Initialization and User Interaction:
The program begins by displaying a welcome message and the game menu, prompting the user to select among Stone, Paper, or Scissors.
It uses a Scanner object to capture the user's input for their choice (0 for Stone, 1 for Paper, 2 for Scissors).

2. Game Loop for Multiple Rounds:
Utilizes a for loop to manage a 5-round match between the user and the computer.
In each round, the program:
Randomly generates the computer's choice (Stone, Paper, or Scissors).
Compares the user's input with the computer's choice to determine the round winner or if it's a tie.
Updates the scores (userpoint and com_point) based on the round result.

3. Displaying Round Information:
For each round, it shows the user's and computer's choices along with the result (win, lose, or tie) of that round.

4. Determining the Final Winner:
After 5 rounds, the program checks the scores to determine the final winner of the match:
If the user's score (userpoint) is greater than the computer's score (com_point), the user wins.
If the scores are equal, it's a draw.
Otherwise, the computer wins.
Displays the final scores and declares the overall winner of the 5-round game.

5. User Interaction and Output:
Throughout the game, the program prompts the user for their choice, displays round information, and at the end, showcases the final scores and announces the winner.
