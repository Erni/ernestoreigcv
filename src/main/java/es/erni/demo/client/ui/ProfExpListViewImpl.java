package es.erni.demo.client.ui;

import java.util.List;

import com.google.gwt.cell.client.ImageCell;
import com.google.gwt.cell.client.ImageResourceCell;
import com.google.gwt.cell.client.SafeHtmlCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

import es.erni.demo.client.domain.Job;
import es.erni.demo.client.style.Styles;

public class ProfExpListViewImpl implements ProfExpListView {

	private static ProfExpListViewImplUiBinder uiBinder = GWT.create(ProfExpListViewImplUiBinder.class);

	interface ProfExpListViewImplUiBinder extends UiBinder<HTMLPanel, ProfExpListViewImpl> {}
	
  private Presenter presenter;
  
  @UiField(provided = true)
  CellTable<Job> table;
  
//  private ListDataProvider<Job> dataProvider = new ListDataProvider<Job>();
  
  private SingleSelectionModel<Job> selectionModel;
  
  private HTMLPanel jobListPanel;

	public ProfExpListViewImpl() {
		createTable();
		jobListPanel = uiBinder.createAndBindUi(this);
	}
	
  // The styles applied to the table.
  interface TableStyle extends CellTable.Style {}
  
  // The resources applied to the table.
  interface TableResources extends CellTable.Resources {
    @Source({CellTable.Style.DEFAULT_CSS, "jobListCellTable.css"})
    TableStyle cellTableStyle();
  }
	
	private void createTable() {
  	CellTable.Resources resources = GWT.create(TableResources.class);
    table = new CellTable<Job>(5,resources);
    
    // Add a selection model so we can select cells.
    selectionModel = new SingleSelectionModel<Job>();
    selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				Job jobSelected = selectionModel.getSelectedObject();
				presenter.jobSelected(jobSelected.getId());
			}
		});
    table.setSelectionModel(selectionModel);
    
    // Set the width of the table and put the table in fixed width mode
    table.setWidth("88%", true);
    
    // Image column
    Column<Job,ImageResource> image = new Column<Job,ImageResource>(new ImageResourceCell()) {
      public ImageResource getValue(Job object) {
      	switch(object.getId()) {
      	case 1:
      		return Styles.resources().facecool();
      	case 2:
      		return Styles.resources().monkey();
      	case 3:
      		return Styles.resources().tux24();
      	case 4:
      		return Styles.resources().fish();
      	default:
      		return Styles.resources().debian();
      	}
      }
    };
    table.addColumn(image, "");
    table.setColumnWidth(image, 5, Unit.PCT);
    
    // Job title column
    TextColumn<Job> title = new TextColumn<Job>() {
      public String getValue(Job job) {
        return job.getTitle();
      }
    };
    title.setHorizontalAlignment(Column.ALIGN_LEFT);
    table.addColumn(title, "Title");
    table.setColumnWidth(title, 35, Unit.PCT);
    
    // Job company column
    TextColumn<Job> company = new TextColumn<Job>() {
      public String getValue(Job job) {
        return job.getCompany();
      }
    };
    company.setHorizontalAlignment(Column.ALIGN_LEFT);
    table.addColumn(company, "Company");
    table.setColumnWidth(company, 35, Unit.PCT);
    
    // Start date column
    TextColumn<Job> started = new TextColumn<Job>() {
      public String getValue(Job job) {
        return job.getStarted();
      }
    };
    started.setHorizontalAlignment(Column.ALIGN_LEFT);
    table.addColumn(started, "Started");
    table.setColumnWidth(started, 15, Unit.PCT);
    
    // Finish date column
    TextColumn<Job> finished = new TextColumn<Job>() {
      public String getValue(Job job) {
        return job.getFinished();
      }
    };
    finished.setHorizontalAlignment(Column.ALIGN_LEFT);
    table.addColumn(finished, "Finished");
    table.setColumnWidth(finished, 15, Unit.PCT);
	}

	public Widget asWidget() {
	  return jobListPanel;
  }

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
  }

	public void setJobList(List<Job> jobList) {
    table.setRowCount(jobList.size(), true);
    table.setRowData(0, jobList);
  }

}
