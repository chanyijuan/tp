package seedu.address.model.job;

import seedu.address.model.applicant.JobId;
import seedu.address.model.applicant.Qualification;
import seedu.address.model.person.Address;
import seedu.address.model.person.Name;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

public class Job {

    // Identity fields
    private final Name jobTitle;
    private final Name company;
    private final JobId id;

    // Data fields
    private final Address address;
    private final Qualification qualification;
    private final JobStatus jobStatus;
    private final Position position;
    private final Salary salary;



    /**
     * Creates a Job object with all attributes for use by Edit method
     */
    public Job(Name title, Name company, JobId id,
               Address address, Qualification qualification, JobStatus jobStatus,
               Position position, Salary salary) {
        requireAllNonNull(title, company, id, address, qualification, jobStatus, position, salary);
        this.jobTitle = title;
        this.company = company;
        this.id = id;
        this.address = address;
        this.qualification = qualification;
        this.jobStatus = jobStatus;
        this.position = position;
        this.salary = salary;
    }

    /**
     * Creates a Job object with minimum required attributes for use by Add method
     */
    public Job(Name title, Name company, JobId id,
               Address address, Qualification qualification, JobStatus jobStatus,
               Position position, Salary salary) {
        requireAllNonNull(title, company, id, address, qualification, jobStatus, position, salary);
        this.jobTitle = title;
        this.company = company;
        this.id = new JobId();
        this.address = address;
        this.qualification = qualification;
        this.jobStatus = jobStatus;
        this.position = position;
        this.salary = salary;
    }

    public Name getJobTitle() {
        return jobTitle;
    }

    public Name getCompany() {
        return company;
    }

    public JobId getJobId() {
        return job;
    }

    public Address getAddress() {
        return address;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public Position getPosition() {
        return position;
    }

    public Salary getSalary() {
        return salary;
    }

    /**
     * Returns true if both Jobs have the same title and company.
     * This defines a weaker notion of equality between two jobs.
     */
    public boolean isSameJob(Job otherJob) {
        if (otherJob == this) {
            return true;
        }

        return otherJob != null
                && otherJob.getJobTitle().equals(getJobTitle())
                && otherJob.getCompany().equals(getCompany());
    }

    /**
     * Returns true if both Jobs have the same identity and data fields.
     * This defines a stronger notion of equality between two jobs.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Job)) {
            return false;
        }

        Job otherJob = (Job) other;
        return otherJob.getJobTitle().equals(getJobTitle())
                && otherJob.getCompany().equals(getCompany())
                && otherJob.getJobId().equals(getJobId())
                && otherJob.getAddress().equals(getAddress())
                && otherJob.getQualification().equals(getQualification())
                && otherJob.getJobStatus().equals(getJobStatus())
                && otherJob.getPosition().equals(getPosition())
                && otherJob.getSalary().equals(getSalary());
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getJobTitle())
                .append("; Company: ")
                .append(getCompany())
                .append("; Job Id: ")
                .append(getJobId())
                .append("; Address: ")
                .append(getAddress())
                .append("; Qualification: ")
                .append(getQualification())
                .append("; Job Status: ")
                .append(getJobStatus())
                .append("; Position: ")
                .append(getPosition())
                .append("; Salary: ")
                .append(getSalary());
        return builder.toString();
    }

}
