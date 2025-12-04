/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6_51422098;

/**
 *
 * @author Nafis
 */
@SpringBootApplication

public class MahasiswaApp implements ApplicationRunner {


    @Autowired

    private MahasiswaService mahasiswaService;


    public static void main(String[] args) {

        System.setProperty("java.awt.headless", "false"); // Disable headless mode


        // Start the Spring application and get the application context

        ApplicationContext context = SpringApplication.run(MahasiswaApp.class, args);


        // Instantiate the view and inject the controller manually

        MahasiswaController controller = context.getBean(MahasiswaController.class);

        MahasiswaView mahasiswaView = new MahasiswaView(controller);

        mahasiswaView.setVisible(true);

    }


    @Override

    public void run(ApplicationArguments args) throws Exception {

        // Implement this method if you need to execute logic after Spring application starts

        // Otherwise, you can leave it as is.

    }

   

}