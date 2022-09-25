import Services.AutomovilService;
import Utils.Utils;

public class ProjectForStand {
    public static void main(String[] args) {
        int option;

        do {
            option = Utils.optionMenu();

            switch (option) {
                case 1 -> new AutomovilService().handlerMenuInsertAutomovil();
                case 4 -> new AutomovilService().handlerMenuShowAutomovil();
            }
        } while (option != 8);
    }
}
