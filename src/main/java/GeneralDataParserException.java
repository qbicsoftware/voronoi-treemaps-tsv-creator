/*
 * Copyright (c) 2016.
 *
 * This file is part of voronoi-treemaps-tsv-creator.
 *
 * voronoi-treemaps-tsv-creator is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * voronoi-treemaps-tsv-creator is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with voronoi-treemaps-tsv-creator.
 * If not, see http://www.gnu.org/licenses/.
 */

/**
 * Created by svenfillinger on 22.01.16.
 */
public class GeneralDataParserException extends RuntimeException{

    public GeneralDataParserException(){
        super();
    }

    public GeneralDataParserException(String s){
        super(s);
    }

    public GeneralDataParserException(Throwable t){
        super(t);
    }

    public GeneralDataParserException(String s, Throwable t){
        super(s, t);
    }

}
