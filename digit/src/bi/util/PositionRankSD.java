/**
 * Copyright 2014 Richard Meier, Stefan Graw, Jeremy Chien, 
 * Peter Beyerlein
 *
 *  This file is part of the software pipeline digit.
 *
 *  digit is free software: you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  digit is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *  
 *  For a copy of the GNU General Public License see 
 *  <http://www.gnu.org/licenses/>.
 *
 */

package bi.util;

public class PositionRankSD extends PositionRank{
	
	private char strand;
	
	public PositionRankSD(int position, ReadTag tag, String chromosomeNumber, char strand){
		super(position,tag,chromosomeNumber);
		this.strand = strand;
	}
	
	public char getStrand(){
		return strand;
	}
}
