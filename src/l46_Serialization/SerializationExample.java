package l46_Serialization;


import java.io.*;

public class SerializationExample  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserChild user = new UserChild();
        user.lifeLevel =55;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;
        user.sword = sword;
        user.childLevel = 65;

        FileOutputStream fos = new FileOutputStream("tempFile");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();

        FileInputStream fis = new FileInputStream("tempFile");
        ObjectInputStream ois = new ObjectInputStream(fis);
        UserChild newUser = (UserChild) ois.readObject();
        ois.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.sword.level);
        System.out.println(newUser.childLevel);

    }

}
