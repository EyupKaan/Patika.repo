Minefield Game
Rules:
- Game is text based.
- It is played on 2D arrays.
- The matrix size (so the number of rows and columns) is determined by the user.
- A quarter of the number of elements in the array is randomly placed. For example the user inputs an array of size 4x3, the number of elements is 4 x 3 = 12 then the number of mines is 12 / 4 = 3.
- If there is a "*" mine in the coordinate entered by the user, user loses, otherwise the sum of the number of mines around the coordinate (right, left, up, down, left upper diagonal, right upper diagonal, right lower diagonal, left lower diagonal) is written to the relevant point.
- If the user can select all the points without pressing any mines, user wins the game.
