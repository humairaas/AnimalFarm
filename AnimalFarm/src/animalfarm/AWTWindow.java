/*
This file is an example from https://learngameprog.com

MIT License

Copyrights © 2019, Philippe-Henri Gosselin.

Permission is hereby granted, free of charge, to any person obtaining a copy of 
this software and associated documentation files (the “Software”), to deal in 
the Software without restriction, including without limitation the rights to 
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of 
the Software, and to permit persons to whom the Software is furnished to do so, 
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all 
copies or substantial portions of the Software.

The Software is provided “as is”, without warranty of any kind, express or 
implied, including but not limited to the warranties of merchantability, fitness 
for a particular purpose and noninfringement. In no event shall the authors or 
copyright holders be liable for any claim, damages or other liability, whether 
in an action of contract, tort or otherwise, arising from, out of or in 
connection with the software or the use or other dealings in the Software.

Except as contained in this notice, the name of Philippe-Henri Gosselin shall 
not be used in advertising or otherwise to promote the sale, use or other 
dealings in this Software without prior written authorization from 
Philippe-Henri Gosselin.

*/
package animalfarm;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTWindow extends Frame {
    public void init(String title) {
        setTitle(title);
        setSize(1000, 680);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}
