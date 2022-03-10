package com.rshaon.snake.entity;

import com.rshaon.snake.graphics.Sprite;
import com.rshaon.snake.level.PixelCoordinate;

public class SnakeFood extends SnakeSegment {
	
	public SnakeFood(PixelCoordinate position) {
		super(position, Sprite.snakeFoodSprite);
	}
}
