package Util;

import Util.ConsoleColour.Background;
import Util.ConsoleColour.Control;
import Util.ConsoleColour.Foreground;

public class TextConstants {

    public static String INVALID_INPUT = " "+ Foreground.BLACK+ Background.LIGHT_RED+"!INVALID INPUT!"+ Control.RESET;
    public static String INPUT_LINE = "\n"+Foreground.LIGHT_GREEN+"> "+ Control.RESET;

    public static String LOGO = Foreground.LIGHT_GREEN +
            " ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ███████╗    ██╗     ██╗███████╗███████╗\n" +
            "██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██╔════╝    ██║     ██║██╔════╝██╔════╝\n" +
            "██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║█████╗      ██║     ██║█████╗  █████╗  \n" +
            "██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║██╔══╝      ██║     ██║██╔══╝  ██╔══╝  \n" +
            "╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝██║         ███████╗██║██║     ███████╗\n" +
            " ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝ ╚═╝         ╚══════╝╚═╝╚═╝     ╚══════╝" +
            Control.RESET;
}
