package com.github.avdyk.myjavaclopedia.osgi.dependencies.uses.api;

import org.joda.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * Print local date.
 *
 * @author <a href="mailto:arnaud.vandyck@staff.voo.be">Arnaud Vandyck</a>
 * @since 1.0.0, 19.11.15.
 */
public interface LocalDatePrinter {

    LocalDate now();

    String print(@NotNull final LocalDate localDate);

}
