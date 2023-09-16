import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dummy_data.csv")); // O(1) - Operación de tiempo constante
            BufferedWriter writer = new BufferedWriter(new FileWriter("processed_data.csv"));// O(1) - Operación de tiempo constante

            String line = reader.readLine();  // O(1) - Operación de tiempo constante
            String[] headers = line.split(",");  // O(1) - Operación de tiempo constante
            writer.write("Username,Birthdate,Age,Income,Debt,IncomeMinusDebt\n");  // O(1) - Operación de tiempo constante

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  // O(1) - Operación de tiempo constante
            Date currentDate = new Date();  // O(1) - Operación de tiempo constante

            // Bucle que itera sobre las líneas del archivo
            while ((line = reader.readLine()) != null) {  // O(n) - 'n' es la cantidad de líneas en el archivo
                String[] values = line.split(",");  // O(1) - Operación de tiempo constante
                String username = values[0];  // O(1) - Operación de tiempo constante
                Date birthdate = dateFormat.parse(values[1]);  // O(1) - Operación de tiempo constante
                double income = Double.parseDouble(values[2]);  // O(1) - Operación de tiempo constante
                double debt = Double.parseDouble(values[3]);  // O(1) - Operación de tiempo constante

                // Cálculos y asignaciones
                long ageInMillis = currentDate.getTime() - birthdate.getTime();  // O(1) - Operación de tiempo constante
                int age = (int) (ageInMillis / (1000 * 60 * 60 * 24 * 365.25));  // O(1) - Operación de tiempo constante

                double incomeMinusDebt = income - debt;  // O(1) - Operación de tiempo constante

                writer.write(username + "," + values[1] + "," + age + "," + income + "," + debt + "," + incomeMinusDebt + "\n");  // O(1) - Operación de tiempo constante
            }

            reader.close();  // O(1) - Operación de tiempo constante
            writer.close();  // O(1) - Operación de tiempo constante

            System.out.println("ETL process completed.");  // O(1) - Operación de tiempo constante
        } catch (IOException | ParseException e) {  // O(1) - Operación de tiempo constante
            e.printStackTrace();  // O(1) - Operación de tiempo constante
        }
    }
}
//La complejidad del algoritmo es d O(n) donde n es la cantidad de lineas que contiene en el archivo "dummy_data.csv"