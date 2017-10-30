package com.github.avdyk.myjavaclopedia.osgi.dependencies.uses.shell;

import com.github.avdyk.myjavaclopedia.osgi.dependencies.uses.api.LocalDatePrinter;
import org.joda.time.LocalDate;

import javax.inject.Named;
import javax.validation.constraints.NotNull;

/**
 * Service able to convert a Joda LocalDate to a String.
 *
 * @author <a href="mailto:arnaud.vandyck@staff.voo.be">Arnaud Vandyck</a>
 * @since 1.0.0, 19.11.15.
 */
@Named("localDatePrinterService")
public class LocalDatePrinterService implements LocalDatePrinter {

    @Override
    public LocalDate now() {
        return LocalDate.now();
    }

    @Override
    public String print(@NotNull LocalDate localDate) {
        return localDate.toString("dd/MM/yyyy");
    }
}
