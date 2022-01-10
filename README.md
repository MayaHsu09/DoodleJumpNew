<h1 align="center">Welcome to Doodly Jump!</h1>
<p align="center">
 
## Game Description

`Doodly Jump` uses the space bar to start the game and the right and left arrow key to control the character. The objective is to play for as long as you can, 
jumping off of platforms. However, if you jump on a red platform, you instantly lose the game. Each time you jump to a new platform, 5 points are added to the score. When you miss the platform and fall your, score and position is reset.  This game can be played by anyone and is very simple. Enjoy!

 ![doodle](https://user-images.githubusercontent.com/29692869/148712423-0ca6cac4-67a4-40b6-9f73-1d3801277de5.gif)

 
## Usage
Space Bar: Starts game
 
Right Key: Moves character to the right
 
Left Key: Moves character to the left

# Classes
### ***Background***
This for the background which is one image and does not move.

![background (1)](https://user-images.githubusercontent.com/29692869/148712271-95d0bf4d-2d5d-44b0-ab6a-dd3226aff5b6.png)

### ***MyChar***
This is for the slime character you are playing and can control. The slime was drawn by us and only one is created in frame.
 
![slime](https://user-images.githubusercontent.com/29692869/148712713-b920f53c-0f8c-4953-aa9a-1cfdf51d6d0a.png)

### ***Platform and Platform2***
This is for the platforms which the character jumps off of. An array is used to create 5 platforms on the screen in a random manner. One out of five platofrms move side to side. There are two classes concerning platforms as one platform is for jumping off and another one will reseult in the game to end. The platform that ends the game appears once for every five regualr platforms.
 
<img src="https://user-images.githubusercontent.com/29692869/148719746-ee12916e-3e77-463e-8252-f53b134edb30.png" width="300" >
<img src="https://user-images.githubusercontent.com/29692869/148719949-adf74a69-37e1-4c05-8910-694bcaf03b48.png" width="300" >
 
# Methods
### ***Paint***
This method draws the background, platform, and characters onto the screen. It also updates the position of the character and platforms throughout the game. An image of the moving platform is included because it requires position updates. Information on the updates will be continued in collisions.
 
![Paint 2](https://user-images.githubusercontent.com/29692869/148715685-d96bae98-7dd7-47b8-b5a8-c39c591d1ef1.jpg)
![Paint 2 (1)](https://user-images.githubusercontent.com/29692869/148718682-7d003562-ebda-4eb3-81bf-8c439e620b46.jpg)

### ***Collisions***
Collisions occur when the character land on a platform. There are two collisions as one collisions is for colliding with a normal platform and there is one method for the collision of the red block.
 
![Collision](https://user-images.githubusercontent.com/29692869/148716781-65e5a9fd-bdf8-4086-b66e-bc4523a0e3c5.jpg)
![Collision2](https://user-images.githubusercontent.com/29692869/148716786-296c12d5-efdd-4f99-91fc-f3798831fea4.jpg)

### ***Game Over***
When the character is unable to land on a platform or lands on a red platform, the character position and score are reset. This is done by setting the character to its inital position, turning gravity off and setting velocity to 0.
 
![Reset](https://user-images.githubusercontent.com/29692869/148715739-02aa51d9-0718-4431-85af-0f8a2d357c3c.jpg)

### ***Creating Objects***
Objects are created individually or in arrays using loops.
 
![Create objects](https://user-images.githubusercontent.com/29692869/148715735-4f49494b-6cae-46a0-880c-982eedcc20b6.jpg)

# Support
Contact Swasti or Maya for support
 
# Roadmap
 Though an update is not likely, if it were to happen, disappearing platforms would be added in which after landing on the platform once, it would disappear. Another update would be the addition of a spring power up where an image of a spring would be on a platform. If the character lands on the spring, they will be boosted up multiple levels as a power up.

 
# Contributing
 Anyone may contribute.
 
# Authors and Acknowledgements
The game is inspired from Doodle jump. The background is from Doodle Jump. Other images and code were made by us. Thank you Mr. David for helping us with platform arrays and rectangle collisions.
