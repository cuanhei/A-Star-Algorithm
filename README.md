# A* Algorithm Demo

This project demonstrates the A* pathfinding algorithm with a graphical interface, allowing users to visualize how the algorithm calculates the shortest path. The user can interact with the grid to set start points, goal points, and solid (obstacle) points, and then execute the algorithm to find the path.

## Features

- **Interactive grid**: Select the start, goal, and solid points by clicking on the grid.
- **Real-time path calculation**: After setting the points, press Enter to calculate and display the shortest path from the start to the goal.
- **Obstacle handling**: Solid points act as barriers that the algorithm will avoid.
- **Visualization**: Watch the A* algorithm in action as it explores the grid and finds the path.

## How It Works

1. **Select Start Point**: Click on a cell to set the starting point.
2. **Select Goal Point**: Click on another cell to set the goal point.
3. **Set Solid Points**: Click on multiple cells to place obstacles (solid points).
4. **Press Enter**: After setting the points, press Enter to calculate and visualize the path.
5. **Pathfinding**: The algorithm will calculate and display the shortest path from the start point to the goal, avoiding any obstacles.

## A* Algorithm Overview

A* is a pathfinding algorithm that efficiently finds the shortest path between two points. It uses a combination of:
- **g(n)**: The cost to reach the current node.
- **h(n)**: The heuristic estimate of the cost to reach the goal from the current node.
- **f(n) = g(n) + h(n)**: The total cost function, which the algorithm tries to minimize.

The algorithm expands the most promising nodes (those with the lowest f(n)) first, ensuring an optimal path is found.

## How to Use:

**Default:** <br>
<img src="https://github.com/user-attachments/assets/b168ca67-44a9-428d-924f-3a51d742e9a9" width="200" />

**Step 1**: Select the starting point by clicking it <br>
<img src="https://github.com/user-attachments/assets/a547521b-88e0-43c7-bd9a-c8d42e7fb693" width="200" />

**Step 2**: Select the goal point by clicking it <br>
<img src="https://github.com/user-attachments/assets/abeb556a-1d5e-41a3-9535-192bd5c60030" width="200">

**Step 3**: Select the solid points by clicking it or direct press enter to find the path <br>
<i>(Without Solid Points)</i> <br>
<img src="https://github.com/user-attachments/assets/255d71f3-96e4-4763-92f5-258f61ec84ba" width="200"> <br>
<i>(With Solid Points)</i> <br>
<img src="https://github.com/user-attachments/assets/f515cba0-6ff9-43bf-bba8-2cb4e0caffe8" width="200">

**Step 4**: Press ENTER to get back Step 1<br>





