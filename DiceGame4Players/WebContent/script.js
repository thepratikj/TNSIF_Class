document.addEventListener("DOMContentLoaded", () => {
    const players = [0, 0, 0, 0]; // Scores of 4 players
    const scoreElements = [
        document.getElementById("score1"),
        document.getElementById("score2"),
        document.getElementById("score3"),
        document.getElementById("score4")
    ];
    const message = document.getElementById("message");
    const rollButton = document.getElementById("rollDice");
    let currentPlayer = 0; // Start from Player 1

    rollButton.addEventListener("click", () => {
        const diceRoll = Math.floor(Math.random() * 6) + 1; // Roll a dice (1-6)
        players[currentPlayer] += diceRoll;
        scoreElements[currentPlayer].textContent = players[currentPlayer];

        message.textContent = `Player ${currentPlayer + 1} rolled a ${diceRoll}`;

        // Check for winner (first to 20)
        if (players[currentPlayer] >= 20) {
            message.textContent = `🎉 Player ${currentPlayer + 1} Wins! 🎉`;
            rollButton.disabled = true;
        } else {
            // Move to the next player
            currentPlayer = (currentPlayer + 1) % 4;
        }
    });
});
