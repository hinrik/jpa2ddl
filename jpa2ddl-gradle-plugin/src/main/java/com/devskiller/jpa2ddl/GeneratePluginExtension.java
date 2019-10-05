package com.devskiller.jpa2ddl;

import java.io.File;
import java.util.Properties;

import org.gradle.api.Project;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;

public class GeneratePluginExtension {

	private final Property<File> outputPath;
	private final Property<GenerationMode> generationMode;
	private final Property<String[]> packages;
	private final Property<Action> action;
	private final Property<Properties> jpaProperties;
	private final Property<Boolean> formatOutput;
	private final Property<Boolean> skipSequences;
	private final Property<String> delimiter;

	public GeneratePluginExtension(Project project) {
		outputPath = project.getObjects().property(File.class);
		generationMode = project.getObjects().property(GenerationMode.class);
		packages = project.getObjects().property(String[].class);
		action = project.getObjects().property(Action.class);
		jpaProperties = project.getObjects().property(Properties.class);
		formatOutput = project.getObjects().property(Boolean.class);
		skipSequences = project.getObjects().property(Boolean.class);
		delimiter = project.getObjects().property(String.class);
	}

	public File getOutputPath() {
		return outputPath.get();
	}

	public void setOutputPath(File outputPath) {
		this.outputPath.set(outputPath);
	}

	public GenerationMode getGenerationMode() {
		return generationMode.get();
	}

	public void setGenerationMode(GenerationMode generationMode) {
		this.generationMode.set(generationMode);
	}

	public String[] getPackages() {
		return packages.get();
	}

	public void setPackages(String[] packages) {
		this.packages.set(packages);
	}

	public Action getAction() {
		return action.get();
	}

	public void setAction(Action action) {
		this.action.set(action);
	}

	public Properties getJpaProperties() {
		return jpaProperties.get();
	}

	public void setJpaProperties(Properties jpaProperties) {
		this.jpaProperties.set(jpaProperties);
	}

	public Boolean getFormatOutput() {
		return formatOutput.get();
	}

	public void setFormatOutput(Boolean formatOutput) {
		this.formatOutput.set(formatOutput);
	}

	public Boolean getSkipSequences() {
		return skipSequences.get();
	}

	public void setSkipSequences(Boolean skipSequences) {
		this.skipSequences.set(skipSequences);
	}

	public String getDelimiter() {
		return delimiter.get();
	}

	public void setDelimiter(String delimiter) {
		this.delimiter.set(delimiter);
	}

	public Provider<File> getOutputPathProvider() {
		return outputPath;
	}

	public Provider<GenerationMode> getGenerationModeProvider() {
		return generationMode;
	}

	public Provider<String[]> getPackagesProvider() {
		return packages;
	}

	public Provider<Action> getActionProvider() {
		return action;
	}

	public Provider<Properties> getJpaPropertiesProvider() {
		return jpaProperties;
	}

	public Provider<Boolean> getFormatOutputProvider() {
		return formatOutput;
	}

	public Provider<Boolean> getSkipSequencesProvider() {
		return skipSequences;
	}

	public Provider<String> getDelimiterProvider() {
		return delimiter;
	}
}
