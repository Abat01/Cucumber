package stepdefinitions;

import io.cucumber.java.en.When;
import pages.LogInPAge;

import java.util.List;

public class LogInStepDefinations {
    @When("kullanici emaili ve sifresini girer")
    public void kullanici_emaili_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {
        // 1. List<String> olarak datalari depolayabiliriz
        @When("kulanici emaili ve sifresini girer")
        public void kulanici_emaili_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {
            LogInPAge loginPAge = new LogInPAge();
            // 1. List<String> olarak datalari depolayabiliriz
            List<String> musteriBilgisi=dataTable.row(1);
            System.out.println(musteriBilgisi.get(0));
            System.out.println(musteriBilgisi.get(1));
            loginPAge.email.sendKeys(musteriBilgisi.get(0));
            loginPAge.password.sendKeys(musteriBilgisi.get(1));
            loginPAge.login.click();
        }

    }
    }

}
