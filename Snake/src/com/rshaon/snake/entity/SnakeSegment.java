package com.rshaon.snake.entity;

import com.rshaon.snake.entity.Entity;
import com.rshaon.snake.graphics.Sprite;
import com.rshaon.snake.level.PixelCoordinate;

public class SnakeSegment extends Entity {
	
	public SnakeSegment(PixelCoordinate position) {
		this.position = position;
	}
	
	public SnakeSegment(PixelCoordinate position, Sprite sprite) {
		this.position = position;
		setSprite(sprite);
	}
}
