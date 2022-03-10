package com.rshaon.snake.level;

import com.rshaon.snake.game.Game;
import com.rshaon.snake.entity.FoodSpawner;
import com.rshaon.snake.entity.SnakeHead;
import com.rshaon.snake.graphics.Screen;
import com.rshaon.snake.input.Keyboard;

public class Level {
	
	protected int width, height;	// these are in tile precision!
	protected int borderPadding = 0;
	
	private SnakeHead snakeHead;
	private FoodSpawner foodSpawner;
	
	private PixelCoordinate spawnPosition = new PixelCoordinate(Game.width >> 1, Game.height >> 1);
	
	public Level(int width, int height, int borderPadding) {
		this.width = width;
		this.height = height;
		this.borderPadding = borderPadding;
	}
	
	public void init(Keyboard keyboard) {
		snakeHead = new SnakeHead(spawnPosition);
		snakeHead.init(this, Game.speed, keyboard);
		foodSpawner = new FoodSpawner(1, 6);
		foodSpawner.init();
	}
	
	public int getScore() {
		return snakeHead.getScore();
	}
	
	public int getBorderPadding() {
		return this.borderPadding;
	}
	
	public SnakeHead getSnakeHead() {
		return snakeHead;
	}
	
	public FoodSpawner getFoodSpawner() {
		return foodSpawner;
	}
	
	public void update() {
		snakeHead.update();
		foodSpawner.update();
	}
	
	public void render(Screen screen) {
		foodSpawner.render(screen);
		snakeHead.render(screen);
	}
}
