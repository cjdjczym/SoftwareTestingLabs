package com.cj.lab5;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SeleniumTest {
    private final String name;
    private final String number;

    public SeleniumTest(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<Object[]> list = new ArrayList<>();
        try {
            String file_path = new File("").getAbsolutePath() + "/test/com/cj/lab5/user_info.csv";
            List<String> csv = readLines(file_path);
            for (int i = 1; i < csv.size(); i++) { // 跳过第一行
                String[] str = csv.get(i).split(",");
                list.add(new Object[]{str[1], str[0]});
            }
            return list;
        } catch (IOException exception) {
            exception.printStackTrace();
            return new ArrayList<>();
        }
    }

    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public String connect(String name) {
        driver.get("http://118.178.137.170:8080/");
        driver.manage().window().setSize(new Dimension(974, 1040));
        driver.findElement(By.id("username")).sendKeys(name);
        driver.findElement(By.cssSelector(".btn")).click();
        WebElement number = driver.findElement(By.cssSelector("td:nth-child(3)"));
        return number.getText();
    }

    @Test
    public void test() {
        System.out.println(this.name + " | " + this.number);
        assertThat(connect(this.name), equalTo(this.number));
    }

    public static List<String> readLines(String path) throws IOException {
        try (InputStream in = new FileInputStream(path);
             Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
             LineNumberReader lineReader = new LineNumberReader(reader)) {
            String line = lineReader.readLine();
            List<String> lines = new ArrayList<>();
            while (line != null) {
                lines.add(line);
                line = lineReader.readLine();
            }
            return lines;
        }
    }
}
