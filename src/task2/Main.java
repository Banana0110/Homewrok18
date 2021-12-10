package task2;

import task2.product.Milk;
//import task2.product.Tea;

/*task2.product.Tea не является public.
 Can't be accessed from outside package. */
public class Main {
    //Tea tea = new Tea();                //<<=закоммендил чтоб ошибку не показывал :D
    Milk milk = new Milk();
/* тут получилось потому что класс Milk явлется публичным.*/
}
