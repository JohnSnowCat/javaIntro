package lesson3.homework.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Products {
    String name;
    String country;
    int weight;
    int price;
    int sort;
}
